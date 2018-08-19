package decorator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ShapeDecoratorTest {

    @Mock
    private PrintStream printStream;

    @Captor
    private ArgumentCaptor<String> stringArgumentCaptor;

    @Test
    public void drawsCircle() {
        new Circle(printStream).draw();
        verify(printStream).println(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getValue()).isEqualTo("Circle");
    }

    @Test
    public void drawsRectangle() {
        new Rectangle(printStream).draw();
        verify(printStream).println(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getValue()).isEqualTo("Rectangle");
    }

    @Test
    public void drawsRedRectangle() {
        new FillDecorator("Red", new Rectangle(printStream)).draw();
        verify(printStream, times(2)).println(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getAllValues()).containsExactly("Red", "Rectangle");
    }

    @Test
    public void drawsBlueCircle() {
        new FillDecorator("Blue", new Circle(printStream)).draw();
        verify(printStream, times(2)).println(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getAllValues()).containsExactly("Blue", "Circle");
    }

    @Test
    public void drawsRedRectangleWithDropShadow() {
        new DropShadowDecorator(new FillDecorator("Red", new Rectangle(printStream))).draw();
        verify(printStream, times(3)).println(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getAllValues()).containsExactly("Red", "Rectangle", "With dropshadow");
    }

}

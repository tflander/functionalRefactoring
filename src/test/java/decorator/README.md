# Decorator Example

The Camera class allows you to put a filter on a camera.

We want to support adding a filter that might be connected to another filter, which may also be connected, so we can have a set of filters to enhance our pictures.

We use decorator pattern to create a set of filters acting as a single filter.

The first time we used decorator pattern in Java was somthing like this:

```
DataInputStream dis =
     new DataInputStream(
         new BufferedInputStream(
           new FileInputStream(file)
         )
     );

while (dis.available() != 0) {
	System.out.println(dis.readLine());
}
dis.close();
```

This allowed us to decorate InputStreams to add functionality while keeping implementations decoupled.
The functionality to open files, buffer input, and read data line-by-line are implemented using the same interface, but are completely separated in implementation.

Decorator pattern is pretty awkward.  Let's make it better with functions.

Let's start by deleting the ColorFilter interface and its implementations, since all we need are functions to take a color and return a potentially modified color.

Now all we have is a broken camera and broken tests.  Let's fix the camera.

Replace the ColorFilter attribute with a function:
```
    private Function<Color, Color> filter;
```

By default, you can set this filter to `Function.identity()`

Once the camera is fixed, fix the tests by passing in Lambdas instead of Filters.
Use `Color::brighter` for the brighter filter, and `Color::darker` for the dark filter.
You can create a double dark filter by defining `Function<Color, Color> doubleDarker = color -> color.darker().darker()`
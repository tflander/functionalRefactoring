# Decorator

## Example

We will start with a variation of the Tutorials Point decorator example for shapes.  We can draw a shape, then decorate it with a drop shadow and/or a fill color.

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

## Exercise

todo
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
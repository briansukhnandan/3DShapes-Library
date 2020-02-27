# 3DShapes Library
## What does this library do exactly?
In a nutshell, this library is a toolkit of algorithms to do various calculations of different 3D-shapes, all of which are done in O(1) time, making this a very efficient library.

## How do I use it?
After adding the .jar located in 'out/artifacts' to your classpath (depending on your IDE), you can reference shapes like so (Cube for example):
```
import Shapes.Cube;
```

Alternatively, you can import all Shapes in the library by doing:
```
import Shapes.*;
```

A simple example:
```
Cube x = new Cube(3); // Writing a cube of edge length 3 to memory.
System.out.println(x.Volume()); // Prints 27.0 as expected.
```

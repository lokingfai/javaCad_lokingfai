// Create a cube
double size =150;
CSG cube = new Cube(size).toCSG()
//create a sphere
CSG sphere = new Sphere(size/20*12.5).toCSG()
//perform a difference
cube.difference(sphere)
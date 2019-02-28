class person
{
public void print_run()
{
System.out.println("run");
}}
class dhivya extends person
{
public void print_read()
{
System.out.println("read");
}}
class chithra extends person
{
public void print_write()
{
System.out.println("write");
}
}
public class Hierarchical
{
public static void main(String arg[])
{
chithra c= new chithra();
c.print_write();
dhivya d= new dhivya();
d.print_read();
d.print_run();
}
}
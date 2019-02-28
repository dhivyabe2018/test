class Teacher
{
public String name;
Teacher(String name)
{
this.name= name;
}
public String getTeacherName()
{return this.name;
}
}
class Student
{
public String name;
Student(String name)
{
this.name= name;
}
public String getStudentName()
{

return  this.name;
}
}
class Association
{
public static void main(String arg[])
{
Teacher t = new Teacher("chithra");
Student s = new Student("dhivya");
System.out.println(s.getStudentName() + " is Student of " +  t.getTeacherName());
}
}

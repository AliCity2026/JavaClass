//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in=new Scanner(System.in);
    IO.print("Enter your age:");
    int age = in.nextInt();


    if(age<18)
        IO.print("Under age");
    else if(age>=18 && age < 40)
        IO.print("Young man");
    else if(age>=40 && age <= 60)
        IO.print("Middle age");
    else
        IO.print("Senior Citizen");
}

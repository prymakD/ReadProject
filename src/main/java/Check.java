
    import java.io.IOException;
    import java.util.Arrays;
    import java.util.Scanner;
    public class Check {

        public static void main(String[] args) throws IOException {

            Scanner in = new Scanner(System.in);
            System.out.print("password : ");
            String passwordhere = in.nextLine();
            String filename = "sample.pdf";


            while (!IsValid.isValid(passwordhere)) {
                System.out.println("The password entered here  is invalid");

                System.out.print("Please enter a given  password : ");
                passwordhere = in.nextLine();

            }
            String[] stringArray = new String[]{"This", "is", "your", "password", passwordhere};

            Arrays.stream(stringArray).forEach(System.out::println);

            PdfCreate.creatPDF(filename, passwordhere);
        }


    }



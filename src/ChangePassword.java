import java.util.Scanner;
public class ChangePassword {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        String userName,password,newPassword;
        System.out.print("Kullanıcı Adınızı:");
        userName = input.nextLine();
        System.out.print("Kullanıcı Şifresi:");
        password = input.nextLine();
        if( userName.equals("Alaa") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else if (!password.equals("java123") ){
            System.out.println("Eğer Şifrenizi Unutuysanız ve Yeni Şifre Uluşturulmak İçin Lütfen Giriniz!");
            newPassword = input.nextLine();
            while ( newPassword.equals("java123")) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                newPassword = input.nextLine();
            }
            password = newPassword;
            System.out.println("Şifre Başarılı oluşturuldu!");
        }else
            System.out.println("Bilgileriniz Yanlış!");
    }
}

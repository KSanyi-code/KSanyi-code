import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("write program name");
        System.out.println(" ");
        System.out.println("cant react for unavailable program names!");
        String b = "";
        while (true) {
            b = sc.nextLine();
            if (b.equals("files")) {
                System.out.println("opening");
                System.out.println("...");
                System.out.println("opened");
                System.out.println("write a file name");
                String i = "";
                while (true) {
                    i = sc.nextLine();
                    if (i.equals("exit")) {
                        System.out.println("-exit-");
                        System.out.println("write a program name");
                        break;
                    } else if (i.equals("programmer")){
                        System.out.println("Kisgyörgy Sándor");
                    } if (i.equals("internet browser")) {
                        System.out.println("chrome");
                    } else {
                        System.out.println("file not found");
                    }
                }
            } else if (b.equals("shut down")) {
                System.out.println("shutting down");
                break;
            } else if (b.equals("AI")) {
                String a = "";
                while (true) {
                    a = sc.nextLine();
                    if (a.equals("Szia")) {
                        System.out.println("Szia");
                    } else if (a.equals("hogy vagy?")) {
                        System.out.println("robot vagyok");
                    } else if (a.equals("end")) {
                        System.out.println("Shutting down");
                        break;
                    } else if (a.equals("mi?")) {
                        System.out.println("*Tessék?");
                    } else if
                    (a.equals("hol laksz?")) {
                        System.out.println("Robot vagyok!!!!!!!!");
                    } else if (a.equals("ki programozott?")) {
                        System.out.println("Kisgyörgy Sándor");
                    } else if (a.equals("mi a programozási nyelved?")) {
                        System.out.println("Java 17");
                    } else if (a.equals("qwertyuiopasdfghjklzxcvbnm")) {
                        System.out.println("aábccsddzdzseéfggyhiíjkllymnnyoóöőpqrsszttyuúüűvwxyzzs");
                    } else if (a.equals("mi a neved?")) {
                        System.out.println("Chat Bot v2.0");
                    } else if (a.equals("Sanyi")) {
                        System.out.println("pro unlocked");
                    } else if (a.equals("Ok")) {
                        System.out.println("Jó");
                    } else if (a.equals("Yes!")) {
                        System.out.println("Minek örülsz?");
                    } else if (a.equals("nem")) {
                        System.out.println("értem");
                    } else if (a.equals("Meh")) {
                        System.out.println("MMMMMEEEEEHHHHH");
                    } else if (a.equals("/kill @s")) {
                        System.out.println("            YOU DIED ");
                        System.out.println("");
                        System.out.println("Sanyikacska is killed by Sanyikacska");
                        break;
                    } else if (a.equals("//cpu.program.runner stop")) {
                        System.out.println("Do you want to stop program?");
                        String c = sc.nextLine();
                        if (c.equals("yes") || c.equals("y")) {
                            System.out.println("program cracked by ****** ");
                            break;
                        }else if(a.equals("exit")){
                            System.out.println("-exit-");
                        }


                    } else {
                        System.out.println("Nem értem, próbáld máshogy!");
                    }
                }
                //AI ENDED

            } else if (b.equals("chrome")) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("write website name");
                String chrome = scanner.nextLine();
                // Ha a felhasználó "youtube"-ot ír be
                if (chrome.equalsIgnoreCase("youtube")) {
                    // Próbáljuk megnyitni a YouTube-ot
                    try {
                        Desktop youtube = Desktop.getDesktop();
                        youtube.browse(new URI("https://www.youtube.com"));
                    } catch (IOException | URISyntaxException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(chrome + " not found");
                    System.out.println("please reopen chrome");
                }
                if(chrome.equalsIgnoreCase("gemini")) {
                    try{
                        Desktop gemini = Desktop.getDesktop();
                        gemini.browse(new URI("https://gemini.google.com"));
                    }catch (IOException | URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                if(chrome.equalsIgnoreCase("whatsapp")) {
                    try {
                        Desktop whatsapp = Desktop.getDesktop();
                        whatsapp.browse(new URI("https://web.whatsapp.com/"));
                    }catch (IOException | URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                if(chrome.equalsIgnoreCase("dino")) {
                    try {
                        Desktop dino = Desktop.getDesktop();
                        dino.browse(new URI("https://chrome://dino/"));
                    }catch (IOException | URISyntaxException e) {
                        e.printStackTrace();
                    }

                }
            }
            //chrome ended

            //write here program
        }
    }
}

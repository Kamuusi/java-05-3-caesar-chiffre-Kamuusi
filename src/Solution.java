public class Solution {
    public static void main(String[] args) {
    //create a program that encrypt or decrypt a message with an variable key.
    String toEncrypt = ""; //if we have a normal message we can encrypt this message using this var with our key
    String toDecrypt = ""; //if its already encrypted, we have a key and need to decrypt, put your message in here
    int key = 6;//this is the key to encrypt. if we need to decrypt a message we just put a minus in front of our var
        System.out.printf("%s\n", toEncrypt); //shows me just 4 fun our original message. just for me to control if the programm works right

    char[] chars = toEncrypt.toCharArray(); //i'm converting my String to an Char Array so we can change every single letter of our message

    for (char ch : chars){ //this for each says that every chars is saving it's own copy in my new char var "ch"
        if (ch >= 'a' && ch <='z'){ //we are controlling if the char is a lower case and if it is, we control the range from a-z
            ch+= key; // letter + key
            if (ch > 'z') { //if we are getting over lower case 'z' we are jumping in here
                ch -= 26;//so we take away 26 from our char to get to our right char we need for the encrypted message
            }else if (ch < 'a'){//this is the other way if we are decrypt a message
                ch+=26;
            }

        //same as above just with upper cases
        }else if ( ch >= 'A' && ch <='Z'){
            ch +=key;
            if (ch > 'Z'){
                ch-=26;
            }else if (ch < 'A'){
                ch+=26;
            }
        //same as above just with char numbers
        }else if (ch >= '0' && ch <='9'){
            ch +=key;
            if (ch >'9'){
                ch-=10;
            }else if (ch < '0'){
                ch+=10;
            }
        }
        System.out.print(ch);
        }

    }

}


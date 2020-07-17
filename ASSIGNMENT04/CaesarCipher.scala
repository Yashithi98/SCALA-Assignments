import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object CaesarCipher extends App{

  val Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val Encryption=(c:Char, key:Int, a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  val Decryption=(c:Char, key:Int, a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
  val Cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  def Result():Unit={ //Function to get the input and run the program and display the output
    printf(" ***** Caesar Cipher *****\n\n")
    printf("Enter a text : ")
    val s = readLine()
    printf("Enter a shift number : ")
    val key = readInt()
    val ct = Cipher(Encryption,s,key,Alphabet)
    val pt = Cipher(Decryption,ct,key,Alphabet)
    printf("The Encrypted text : %s \nThe Decrypted text : %s",ct,pt)
  }
  Result()
}

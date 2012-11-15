import java.io.DataInputStream;
import java.io.DataOutputStream;

public class cv extends eg
{
  public static int a = 119;
  public String b;
  private boolean c = true;

  public cv() {
  }

  public cv(String paramString) {
    this(paramString, true);
  }

  public cv(String paramString, boolean paramBoolean) {
    if (paramString.length() > a) {
      paramString = paramString.substring(0, a);
    }

    this.b = paramString;
    this.c = paramBoolean;
  }

  public void a(DataInputStream paramDataInputStream)
  {
    this.b = a(paramDataInputStream, a);
  }

  public void a(DataOutputStream paramDataOutputStream)
  {
    a(this.b, paramDataOutputStream);
  }

  public void a(eh parameh)
  {
	MacSpeech.post(this.b);
    parameh.a(this);
  }

  public int a()
  {
    return 2 + this.b.length() * 2;
  }

  public boolean d() {
    return this.c;
  }

  public boolean a_()
  {
    return !this.b.startsWith("/");
  }
}
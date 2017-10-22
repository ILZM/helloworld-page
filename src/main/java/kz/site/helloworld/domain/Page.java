package kz.site.helloworld.domain;

public class Page
{
    private String msg;

    public Page ( ) { }

    public void setMessage ( String m ) { this.msg = m; }

    public String getMessage ( ) { return this.msg; }

    @Override
    public String toString ( )
    {
        return this.msg;
    }
}
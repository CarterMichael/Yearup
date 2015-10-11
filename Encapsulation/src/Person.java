
public class Person
{
private String m_name=null;
private int m_age=-1;
private String m_phoneNumber=null;
private String m_address=null;


Person(String name, int age,String phoneNumber,String address)
{
	Setname(name);
    SetAge(age);
    SetPhoneNumber(phoneNumber);
    Setaddress(address);
}

String Getname ()
{return m_name;}

 private void  Setname(String name)
 {m_name=name;}

int GetAge()
{return m_age;}
private void SetAge(int age)
{m_age=age;}

String GetPhoneNumber()
{return m_phoneNumber;}

private void SetPhoneNumber (String phoneNumber)
{m_phoneNumber= phoneNumber;}


String GetAddress()
{return m_address;}

private void Setaddress (String address)
{m_address=address;}

void GrowsOlder()
{int currentAge = GetAge();
SetAge(currentAge+1);}









}


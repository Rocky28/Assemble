package Assemble;
import java.sql.*;
public class AssembleBean {
    Connection db=null;
    PreparedStatement ps=null,ps1=null;
    ResultSet rs=null,rs1=null;
    public AssembleBean()
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            db=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=G:/My projects/Assemble.net/Assemble.accdb");
            
        }
        catch(Exception e1)
        {
            System.out.println(e1.toString());
        }
    }
    ResultSet srchCompo(String cmp,String p1)
    {
        try{
            int price=Integer.parseInt(p1);
            String sql="Select * from "+cmp+" where inr<=?";
            System.out.println(sql);
            ps=db.prepareStatement(sql);
            ps.setInt(1, price);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs;
    }
    public ResultSet getCabinets()
    {
        try{
            String sql="Select * from Cabinets";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getProcessors()
    {
        try{
            String sql="Select * from Processors";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getMotherboards()
    {
        try{
            String sql="Select * from Motherboards";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getRam()
    {
        try{
            String sql="Select * from Ram";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getPsu()
    {
        try{
            String sql="Select * from Psu";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getMouse()
    {
        try{
            String sql="Select * from Mouse";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
            
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getSpeakers()
    {
        try{
            String sql="Select * from Speaker";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getIhdd()
    {
        try{
            String sql="Select * from Internalhdd";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getGcards()
    {
        try{
            String sql="Select * from Graphicscard";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getTvtcard()
    {
        try{
            String sql="Select * from Tvtuner";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getUps()
    {
        try{
            String sql="Select * from Ups";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getOthers()
    {
        try{
            String sql="Select * from ";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getMonitor()
    {
        try{
            String sql="Select * from Monitor";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getWebcam()
    {
        try{
            String sql="Select * from Webcam";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getIwriter()
    {
        try{
            String sql="Select * from Internalwriter";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getKeyboard()
    {
        try{
            String sql="Select * from Keyboard";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getEwriter()
    {
        try{
            String sql="Select * from Externalwriter";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getEhdd()
    {
        try{
            String sql="Select * from Externalhdd";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getSsd()
    {
        try{
            String sql="Select * from Ssd";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getSoundcard()
    {
        try{
            String sql="Select * from Soundcard";
            ps=db.prepareStatement(sql);
            rs=ps.executeQuery();
        }catch(Exception e){
    }
    return rs; 
    }
    public ResultSet getTypeResults(String type,String compo)
    {
        int inrl,inrh;
        try{
            if(type.trim().equals("Home"))
            {
                inrl=0;
                inrh=6000;
            }
            else if(type.trim().equals("Pro"))
            {
                inrl=6000;
                inrh=15000;
            }
            else
            {
                inrl=10000;
                inrh=25000;
            }
            String sql="Select * from "+compo+" where inr>=? and inr<=?";
            ps=db.prepareStatement(sql);
            ps.setInt(1,inrl);
            ps.setInt(2, inrh);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertFirstRecord(String em)
    {
        java.util.Date dt=new java.util.Date();
        String str=dt.toString();
        try{
            ps=db.prepareStatement("insert into assembleorder values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, "Ongoing");
            ps.setString(2, em);
            ps.setString(3, str);
            for(int i=4;i<23;i++)
            {
                ps.setString(i, "NULL");
            }
            ps.setInt(23, 0);
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public ResultSet getUserCabinetChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from cabinets where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateCabinet(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set cabinet=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getCabinetPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from cabinets where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserMotherboardChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Motherboards where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateMotherboard(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Motherboard=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getMotherboardPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Motherboards where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserProcessorChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Processors where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateProcessor(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Processor=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getProcessorPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Processors where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserInternalhddChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Internalhdd where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateInternalhdd(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Internalhdd=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getInternalhddPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Internalhdd where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserExternalhddChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Externalhdd where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateExternalhdd(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Externalhdd=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getExternalhddPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Externalhdd where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserRamChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Ram where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateRam(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Ram=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getRamPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Ram where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserSsdChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from ssd where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateSsd(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set ssd=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getSsdPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from ssd where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserInternalwriterChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Internalwriter where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateInternalwriter(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Internalwriter=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getInternalwriterPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Internalwriter where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserExternalwriterChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Externalwriter where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateExternalwriter(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Externalwriter=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getExternalwriterPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Externalwriter where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserMonitorChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Monitor where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateMonitor(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Monitor=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getMonitorPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Monitor where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserGraphicscardChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Graphicscard where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateGraphicscard(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Graphicscard=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getGraphicscardPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Graphicscard where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserKeyboardChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Keyboard where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateKeyboard(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Keyboard=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getKeyboardPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Keyboard where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserMouseChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Mouse where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateMouse(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Mouse=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getMousePrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Mouse where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserPsuChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from psu where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdatePsu(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set psu=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getPsuPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from psu where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserSoundcardChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Soundcard where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateSoundcard(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Soundcard=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getSoundcardPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Soundcard where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserSpeakerChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Speaker where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateSpeaker(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Speaker=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getSpeakerPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Speaker where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserWebcamChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Webcam where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateWebcam(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Webcam=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getWebcamPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr from Webcam where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
     public ResultSet getUserUpsChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from ups where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateUps(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set ups=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getUpsPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr ups where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
      public ResultSet getUserTvtunerChoice(String cmpname)
    {
        try{
            ps=db.prepareStatement("select * from Tvtuner where pname=?");
            ps.setString(1, cmpname);
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void insertUpdateTvtuner(String cmpname,int price,String em)
    {
        try{
            ps=db.prepareStatement("select totalcost from assembleorder where emailaddress=? and status=?");
            ps.setString(1,em.trim());
            ps.setString(2, "Ongoing");
            rs=ps.executeQuery();
            rs.next();
            int oldprice=rs.getInt(1);
            int newprice=oldprice+price;
            System.out.println(newprice);
            ps=db.prepareStatement("update assembleorder set Tvtuner=?,totalcost=? where status=? and emailaddress=?");
            ps.setString(1, cmpname);
            ps.setInt(2, newprice);
            ps.setString(3, "Ongoing");
            ps.setString(4, em.trim());
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    public int getTvtunerPrice(String cmp)
    {
        int price=0;
        try{
            ps=db.prepareStatement("select inr Tvtuner where pname=?");
            ps.setString(1, cmp);
            rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(1);
        }catch(Exception e){}
        return price;
    }
    public ResultSet getMyOrder(String em)
    {
        try{
            ps=db.prepareStatement("select * from assembleorder where emailaddress=? and status=?");
            ps.setString(1, em);
            ps.setString(2, "Reviewing");
            rs=ps.executeQuery();
        }catch(Exception e){}
        return rs;
    }
    public void updateOrderStatus(String em)
    {
        try{
            ps=db.prepareStatement("update assembleorder set status=? where emailaddress=? and status=?");
            ps.setString(1, "Reviewing");
            ps.setString(2, em);
            ps.setString(3, "Ongoing");
            ps.executeUpdate();
        }catch(Exception e){}
    }
}
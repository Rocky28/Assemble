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
            String sql="Select * from "+cmp+" where inr<="+p1;
            ps=db.prepareStatement(sql);
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
}
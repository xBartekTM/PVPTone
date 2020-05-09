package pvptone.data;

public class BlacklistUser extends Object<BlacklistUser>
{
    public String reason;
    public String admin;
    public String time;
    public String ip;
    public String name;
    
    public String getName() {
        return this.name;
    }
    
    public String getTime() {
        return this.time;
    }
    
    public String getIp() {
        return this.ip;
    }
    
    public void setReason(final String Variable_91102) {
        this.reason = Variable_91102;
    }
    
    public void setName(final String Variable_91106) {
        this.name = Variable_91106;
    }
    
    public void setTime(final String Variable_91109) {
        this.time = Variable_91109;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public void setIp(final String Variable_91115) {
        this.ip = Variable_91115;
    }
    
    public BlacklistUser(final String Variable_91123, final String Variable_91118, final String Variable_91119, final String Variable_91120, final String Variable_91121) {
        this.name = Variable_91123;
        this.ip = Variable_91118;
        this.admin = Variable_91119;
        this.reason = Variable_91120;
        this.time = Variable_91121;
    }
    
    public String getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(final String Variable_91132) {
        this.admin = Variable_91132;
    }
}

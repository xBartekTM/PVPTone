package pvptone.data;

public class User extends Object<User>
{
    public String name;
    public int itemid;
    public String role;
    public int hatid;
    public int tail;
    public int wingsid;
    
    public void setName(final String Variable_7107) {
        this.name = Variable_7107;
    }
    
    public void setWingsid(final int Variable_7111) {
        this.wingsid = Variable_7111;
    }
    
    public void setRole(final String Variable_7116) {
        this.role = Variable_7116;
    }
    
    public int getHatid() {
        return this.hatid;
    }
    
    public void setHatid(final int Variable_7121) {
        this.hatid = Variable_7121;
    }
    
    public int getWingsid() {
        return this.wingsid;
    }
    
    public int getItemid() {
        return this.itemid;
    }
    
    public void setItemid(final int Variable_7129) {
        this.itemid = Variable_7129;
    }
    
    public User(final String Variable_7134, final String Variable_7135, final int Variable_7139, final int Variable_7141, final int Variable_7133) {
        this.name = Variable_7134;
        this.role = Variable_7135;
        this.wingsid = Variable_7139;
        this.hatid = Variable_7141;
        this.itemid = Variable_7133;
    }
    
    public int getTailid() {
        return this.tail;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setTailid(final int Variable_7151) {
        this.tail = Variable_7151;
    }
    
    public String getRole() {
        return this.role;
    }
}

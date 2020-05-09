package pvptone.options;

import java.util.*;

public class Value extends Object<Value>
{
    public int[] Field_905;
    public Object value;
    public Object valueMax;
    public Object defaultValue;
    public List list;
    public Object valueMin;
    public boolean isValueDouble;
    public String name;
    public double step;
    
    static {
        Method_4126();
        Value.list = new ArrayList();
    }
    
    public void setValueState(final Object Variable_42090) {
        this.value = Variable_42090;
    }
    
    public boolean Method_4125(final int n) {
        return this != 0;
    }
    
    public Value(final String Variable_42099, final Object Variable_42095, final Object Variable_42098, final Object Variable_42101) {
        this.isValueDouble = (Value.Field_905[0] != 0);
        this.defaultValue = this.value;
        this.name = Variable_42099;
        this.value = Variable_42095;
        this.valueMin = Variable_42098;
        this.valueMax = Variable_42101;
        this.step = 0.1;
        if (Method_4125((this.value instanceof Double) ? 1 : 0)) {
            this.isValueDouble = (Value.Field_905[1] != 0);
        }
        Value.list.add(this);
        "".length();
    }
    
    public void Method_4126() {
        (Value.Field_905 = new int[2])[0] = ((0xAD ^ 0xB1) & ~(0x92 ^ 0x8E));
        Value.Field_905[1] = " ".length();
    }
    
    public Value(final String Variable_42105, final Object Variable_42106) {
        this.isValueDouble = (Value.Field_905[0] != 0);
        this.defaultValue = Variable_42106;
        this.name = Variable_42105;
        this.value = Variable_42106;
        if (Method_4125((Variable_42106 instanceof Double) ? 1 : 0)) {
            this.isValueDouble = (Value.Field_905[1] != 0);
        }
        Value.list.add(this);
        "".length();
    }
    
    public Object getValueState() {
        return this.value;
    }
    
    public Value(final String Variable_42123, final Object Variable_42113, final Object Variable_42118, final Object Variable_42115, final double Variable_42114) {
        this.isValueDouble = (Value.Field_905[0] != 0);
        this.defaultValue = Variable_42113;
        this.name = Variable_42123;
        this.value = Variable_42113;
        this.valueMin = Variable_42118;
        this.valueMax = Variable_42115;
        this.step = Variable_42114;
        if (Method_4125((Variable_42113 instanceof Double) ? 1 : 0)) {
            this.isValueDouble = (Value.Field_905[1] != 0);
        }
        Value.list.add(this);
        "".length();
    }
}

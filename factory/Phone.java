public abstract class Phone {

protected list<Specification> specifications = new ArrayList<Specification>();    

public Phone() {
    createPhone()
}

protected abstract void createPhone();

@Override
public String toString() {
    final StringBuffer sb = new StringBufffer("Phone");
    sb.append("specifications").append(specifications);
    sb.append('}');
    return sb.toString();
}
    
}

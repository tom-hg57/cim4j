import cim4j.CIMClassMap;

/**
 * Main class of the cim4j application.
 */
public final class Main {

    // Private dummy constructor - prevent to instantiate the class at all
    private Main() {
    }

    static public void main(String[] args) throws Exception {
        System.out.println("Hello World");

        Integer cnt = CIMClassMap.classMap.size();
        System.out.println("CIMClassMap.classMap.size() = " + cnt.toString());

        var template = CIMClassMap.classMap.get("BaseVoltage");
        var bv1 = template.construct();
        var bv2 = template.construct();

        bv1.setRdfid("20kV");
        bv1.setAttribute("nominalVoltage", "20.0");
        bv1.setAttribute("name", "20 kV");

        bv2.setRdfid("110kV");
        bv2.setAttribute("nominalVoltage", "110.0");
        bv2.setAttribute("name", "110 kV");

        System.out.println("bv1.debugString()   = " + bv1.debugString());
        System.out.println("bv1.toString(false) = " + bv1.toString(false));
        System.out.println("bv1.toString(true)  =");
        System.out.println(bv1.toString(true));

        System.out.println("bv2.debugString()  = " + bv2.debugString());
        System.out.println("bv2.toString(false) = " + bv2.toString(false));
        System.out.println("bv2.toString(true)  =");
        System.out.println(bv2.toString(true));
    }
}

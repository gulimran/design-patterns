package imran.template;

abstract class GeneralClass {

    abstract void customize1();

    abstract void customize2();

    final void templateMethod() {
        customize1();
        customize2();
    }
}

class Phone {
    double weight;
    //return type is set to double for the method setWeight() but with out return type compilation error seen
    double setWeight(double val) {
        weight = val;
        System.out.print(weight);
        return weight;

    }
    double getWeight() {
        return weight;
    }
}

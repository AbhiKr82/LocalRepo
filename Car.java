package LocalRepo;

class Car {
    String Brand;
    String Model;
    int price;

    Car(String b,String m,int p){
        this.Brand=b;
        this.Model=m;
        this.price=p;
    }
    Car (Car c1){
        this.Brand=c1.Brand;
        this.Model=c1.Model;
        this.price=c1.price;
    }

    String getModel(){
        return this.Model;
    }

    int getprice(){
        return this.price;

    }
}

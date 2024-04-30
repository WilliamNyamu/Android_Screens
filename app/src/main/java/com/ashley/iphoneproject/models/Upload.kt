package com.ashley.iphoneproject.models

class Upload {
    var name: String = ""
    var quantity: String = ""
    var price: String = ""
    var ImageUrl: String = ""
    var id: String = ""
    constructor(name:String,quantity:String,price:String,ImageUrl:String, id:String){
        this.name=name
        this.quantity = quantity
        this.price=price
        this.ImageUrl = ImageUrl
        this.id=id
    }
    constructor()
}
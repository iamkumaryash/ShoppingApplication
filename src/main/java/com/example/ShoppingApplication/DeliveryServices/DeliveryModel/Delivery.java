package com.example.ShoppingApplication.DeliveryServices.DeliveryModel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Boolean paymentAccepted;
    private String deliveryAddress;
    private Boolean ItemDelivered;

    public Delivery() {
    }

    public Delivery(Boolean paymentAccepted, String deliveryAddress, Boolean itemDelivered) {
        this.paymentAccepted = paymentAccepted;
        this.deliveryAddress = deliveryAddress;
        ItemDelivered = itemDelivered;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getPaymentAccepted() {
        return paymentAccepted;
    }

    public void setPaymentAccepted(Boolean paymentAccepted) {
        this.paymentAccepted = paymentAccepted;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Boolean getItemDelivered() {
        return ItemDelivered;
    }

    public void setItemDelivered(Boolean itemDelivered) {
        ItemDelivered = itemDelivered;
    }
}

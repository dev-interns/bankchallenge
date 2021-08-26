package com.endava.bankchallenge.model;

import com.endava.bankchallenge.factory.OfficeFactory;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int bankId;
    private String nameBank;
    private List<Office> listOffices;

    public Bank(int bankId, String nameBank) {
        listOffices = new ArrayList<>();
        this.bankId = bankId;
        this.nameBank = nameBank;
    }

    public void createNewOffice(String officeType, String officeName, String officeAddress){
        Office newOffice = OfficeFactory.createOffice(officeType,officeName,officeAddress);
        listOffices.add(newOffice);
    }

    public void deleteOffice(String officeName){
        for(int i=0;i<listOffices.size();i++){
            if(listOffices.get(i).getOfficeName() == (officeName)){
                listOffices.remove(i);
            }
        }
    }

    public void renameOffice(String officeName, String newOfficeName){
        for(int i=0;i<listOffices.size();i++){
            if(listOffices.get(i).getOfficeName() == (officeName)){
                listOffices.get(i).setOfficeName(newOfficeName);
            }
        }

    }

    public void updateAddressOffice(String officeAddress, String newOfficeAddress){
        for(int i=0;i<listOffices.size();i++){
            if(listOffices.get(i).getOfficeAddress() == (officeAddress)){
                listOffices.get(i).setOfficeAddress(newOfficeAddress);
            }
        }
    }

    public void showOffices(){
        for(int i=0;i<listOffices.size();i++){
            System.out.println("---------------------");
            System.out.println("Office ID: "+listOffices.get(i).getOfficeId());
            System.out.println("Office type: "+listOffices.get(i).getOfficeType());
            System.out.println("Office name: "+listOffices.get(i).getOfficeName());
            System.out.println("Office address: "+listOffices.get(i).getOfficeAddress());
        }
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public List<Office> getListOffices() {
        return listOffices;
    }

    public void setListOffices(List<Office> listOffices) {
        this.listOffices = listOffices;
    }
}
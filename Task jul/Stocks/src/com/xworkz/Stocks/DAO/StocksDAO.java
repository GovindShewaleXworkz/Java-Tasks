package com.xworkz.Stocks.DAO;

import com.xworkz.Stocks.DTO.StocksDTO;

public class StocksDAO {
    StocksDTO dto;

    public void createStock(StocksDTO dto) {
        boolean isStockNameCreated = false;
        boolean isStockRefIdCreated = false;
        boolean isStockPriceCreated = false;
        boolean isStockSlotCreated = false;
        boolean isStockStartDateCreated = false;
        if (dto != null) {
            if (dto.stocksName != null) {
                isStockNameCreated = true;
            } else {
                System.out.println("Please provide valid name");
            }
            if (dto.stockREfId != 0) {
                isStockRefIdCreated = true;
            } else {
                System.out.println("Please provide valid RefId");
            }
            if (dto.price != 0.0) {
                isStockPriceCreated = true;
            } else {
                System.out.println("Please provide valid price");
            }
            if (dto.startDate != null) {
                isStockStartDateCreated = true;
            } else {
                System.out.println("Please provide valid Start date");
            }
            if (dto.noOfSlots != 0) {
                isStockSlotCreated = true;
            } else {
                System.out.println("Please provide valid number of slots");
            }
            if (isStockNameCreated && isStockRefIdCreated && isStockPriceCreated && isStockSlotCreated && isStockStartDateCreated) {
                this.dto = dto;
                System.out.println("Stock created successfully.");
            } else {
                System.out.println("Please provide valid information");
            }
        } else {
            System.out.println("Please provide valid information.");
        }
    }

    public void getStocks() {
        if (dto != null) {
            System.out.println("The available stocks are:");
            System.out.println("Stock Ref ID: " + dto.stockREfId);
            System.out.println("Stock Name: " + dto.stocksName);
            System.out.println("No. of Slots: " + dto.noOfSlots);
            System.out.println("Price: " + dto.price);
            System.out.println("Start Date: " + dto.startDate);
        } else {
            System.out.println("No stock details available.");
        }
    }
}

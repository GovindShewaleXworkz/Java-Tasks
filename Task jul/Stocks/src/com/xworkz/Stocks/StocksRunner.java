package com.xworkz.Stocks;

import com.xworkz.Stocks.DAO.StocksDAO;
import com.xworkz.Stocks.DTO.StocksDTO;

public class StocksRunner {

    public static void main(String[] args) {
        StocksDTO dto=new StocksDTO();
        StocksDAO dao=new StocksDAO();

        dto.stocksName="Mazda";
        dto.stockREfId=123456234;
        dto.noOfSlots=29;
        dto.price=2345.67;
        dto.startDate="26-July-2024";

        dao.createStock(dto);
        dao.getStocks();
    }

}

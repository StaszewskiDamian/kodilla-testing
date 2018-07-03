package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void ItemTest() {
        //Given
        Invoice invoice = new Invoice("888");
        Product product = new Product("orenzada");
        Item item = new Item(new BigDecimal(4), 5, new BigDecimal(20));
        List<Item> items = new ArrayList<>();
        items.add(item);
        invoice.setItems(items);
        product.setItemList(items);
        item.setInvoice(invoice);
        item.setProduct(product);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(item);
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findById(id).orElse(null);

        //Then
        Assert.assertEquals("888", readInvoice.getNumber());

        //CleanUp done by @Transactional
    }
}

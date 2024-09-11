package com.alexli.cstraining.controller;

import com.alexli.cstraining.pojo.JsonResult;
import com.alexli.cstraining.pojo.ShopCartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/shopcart")
public class ShopCartController {

    /*
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductOrderService productOrderService;

    @GetMapping(value = "/list")
    public List<ShopCartItem> list(HttpSession session) {
        return getShopCart(session);
    }

    @PostMapping("/add")
    public JsonResult save(@RequestParam("idList[]") List<Integer> idList, HttpSession session) {
        for (Integer id : idList) {
            List<ShopCartItem> shopCartItems = getShopCart(session);
            boolean found = false;
            for (ShopCartItem sci : shopCartItems) {
                if (id.equals(sci.getProductId())) {
                    sci.setCount(sci.getCount() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                Product product = productService.queryById(id);
                if (product != null) {
                    ShopCartItem item = new ShopCartItem();
                    item.setProductId(product.getId());
                    item.setProductName(product.getProductName());
                    item.setPrice(product.getPrice());
                    item.setCount(1);
                    shopCartItems.add(item);
                }
            }
        }
        return new JsonResult("success", "添加成功");
    }

    private List<ShopCartItem> getShopCart(HttpSession session) {
        List<ShopCartItem> result = null;
        if (session.getAttribute("shopcart") == null) {
            result = new ArrayList<>();
            session.setAttribute("shopcart", result);
        } else
            result = (List<ShopCartItem>) session.getAttribute("shopcart");
        return result;
    }


    @PostMapping("/deleteByList")
    public JsonResult deleteByList(@RequestParam("idList[]") List<Integer> idList, HttpSession session) {
        List<ShopCartItem> shopCartItems = getShopCart(session);
        for (Integer id : idList) {
            for (int i = 0; i < shopCartItems.size(); i++) {
                if (id.equals(shopCartItems.get(i).getProductId())) {
                    shopCartItems.remove(i);
                    break;
                }
            }
        }
        return new JsonResult("success", "删除成功");
    }

    @PostMapping("/order")
    public JsonResult order(HttpSession session) throws Exception {
        if (session.getAttribute("userLogined") == null) {
            return new JsonResult("Notlogin", "未登录");
        }
        User user = (User) session.getAttribute("userLogined");

        List<ShopCartItem> shopCartItems = getShopCart(session);
        if (shopCartItems.size() == 0) {
            return new JsonResult("fail", "购物车中没有商品");
        } else {
            ProductOrder order = new ProductOrder();
            order.setOrderUser(user);
            order.setOrderTime(new Date());
            float total = 0.0f;
            List<OrderItem> items = new ArrayList<>();
            for (ShopCartItem item : shopCartItems) {
                Product p = productService.queryById(item.getProductId());
                if (p == null)
                    continue;
                OrderItem oi = new OrderItem();
                oi.setOrder(order);
                oi.setProduct(p);
                oi.setCount(item.getCount());
                oi.setPrice(p.getPrice());
                total += oi.getPrice() * oi.getCount().floatValue();
                items.add(oi);
            }
            order.setTotalMoney(total);
            try {
                productOrderService.save(order, items);
            } catch (Exception e) {
                return new JsonResult("fail",e.getMessage());
            }
            shopCartItems.clear();
            return new JsonResult("success", "购物成功！！！");
        }
    }

     */
}
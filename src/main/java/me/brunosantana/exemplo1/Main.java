package me.brunosantana.exemplo1;

import org.modelmapper.ModelMapper;

public class Main {

    public static void main(String[] args) {

        var name = new Name();
        name.setFirstName("Bruno");
        name.setLastName("Sant' Ana");

        var customer = new Customer();
        customer.setName(name);

        var address = new Address();
        address.setCity("São Paulo");
        address.setStreet("Rua Inglaterra, 500");

        var order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(address);

        ModelMapper modelMapper = new ModelMapper();
        OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

        System.out.println(order);
        System.out.println(orderDTO);
    }

}

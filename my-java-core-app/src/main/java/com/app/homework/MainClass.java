package main.java.com.app.homework;

import main.java.com.app.homework.devices.Laptop;
import main.java.com.app.homework.devices.Phone;
import main.java.com.app.homework.devices.Tv;
import main.java.com.app.homework.enums.DeviceTypes;
import main.java.com.app.homework.enums.ProductType;
import main.java.com.app.homework.exceptions.DeviceNotFoundException;
import main.java.com.app.homework.factory.DeviceFactory;
import main.java.com.app.homework.utils.ConsoleOutputUtils;

public class MainClass {

    public static void main(String[] args) {

        DeviceFactory deviceFactory = new DeviceFactory();

        Device xiaomi = deviceFactory.createDevice(DeviceTypes.PHONE);
        xiaomi.setHeight(12);
        xiaomi.setModel("Mi10");
        try {
            xiaomi.readDeviceFromDB();
        } catch (DeviceNotFoundException e) {
            e.printStackTrace();
        }
        // QUESTION: if this is valid expression when we call Phone method and cast Device to Phone?
        ((Phone) xiaomi).setMonoBlock(true);
        ConsoleOutputUtils.print(xiaomi.getManufacturer());
        xiaomi.setProductType(ProductType.ELECTRONICS);
        xiaomi.buy();
        xiaomi.sale();
        ConsoleOutputUtils.print(xiaomi.toString());
        ConsoleOutputUtils.print("hashCode: " + xiaomi.hashCode());
        ConsoleOutputUtils.print("id: " + xiaomi.getId());

        Device iPhone = deviceFactory.createDevice(DeviceTypes.PHONE);
        iPhone.setHeight(13);
        iPhone.setModel("X100");
        // QUESTION: if this is valid expression when we call Phone method and cast Device to Phone?
        ((Phone) iPhone).setMonoBlock(true);
        iPhone.setProductType(ProductType.ELECTRONICS);
        iPhone.buy();
        iPhone.sale();
        ConsoleOutputUtils.print(iPhone.toString());
        ConsoleOutputUtils.print("hashCode: " + iPhone.hashCode());
        ConsoleOutputUtils.print("id: " + iPhone.getId());

        Device samsungTV = deviceFactory.createDevice(DeviceTypes.TV);
        samsungTV.setHeight(12);
        samsungTV.setModel("Mi10");
        samsungTV.setProductType(ProductType.ELECTRONICS);
        samsungTV.buy();
        samsungTV.sale();
        System.out.println(samsungTV.toString());
        System.out.println("hashCode: " + samsungTV.hashCode());
        System.out.println("id: " + samsungTV.getId());

        Device lenovoT = deviceFactory.createDevice(DeviceTypes.LAPTOP);
        lenovoT.setModel("T470s");
        lenovoT.setProductType(ProductType.ELECTRONICS);
        lenovoT.buy();
        lenovoT.sale();
        ConsoleOutputUtils.print(lenovoT.toString());
        ConsoleOutputUtils.print("hashCode:" + lenovoT.hashCode());
        ConsoleOutputUtils.print("id: " + lenovoT.getId());

        Device dell = deviceFactory.createDevice(DeviceTypes.LAPTOP);
        dell.setModel("D570");
        dell.setProductType(ProductType.ELECTRONICS);
        dell.buy();
        dell.sale();
        ConsoleOutputUtils.print(dell.toString());
        ConsoleOutputUtils.print("hashCode:" + dell.hashCode());
        ConsoleOutputUtils.print("id: " + dell.getId());

        ConsoleOutputUtils.print("laptop equality: " + lenovoT.equals(dell));
        ConsoleOutputUtils.print("phones equality: " + xiaomi.equals(iPhone));
    }
}

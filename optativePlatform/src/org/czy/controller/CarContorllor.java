package org.czy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.czy.bean.Car;
import org.czy.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*@Controller是springMVC的注解*/
@Controller
public class CarContorllor {
	/* 属性 */
	private CarService carService;
	public CarService getCs() {
		return carService;
	}
	/* @Autowired是spring的注解 实现service的自动填充 */
	@Autowired
	public void setCs(CarService carService) {
		this.carService = carService;
	}
	/**
	 * 查询所有车辆信息
	 * @return
	 */
	@RequestMapping("selectAllCar")
	@ResponseBody
	public Object selectAllCar() {
		return carService.selectAllCar();
	}
	/**
	 * 根据条件查询
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("selectCar")
	@ResponseBody
	public Object selectCar(HttpServletRequest request, HttpServletResponse response) {
		String level = request.getParameter("level");
		String driveMode = request.getParameter("driveMode");
		String gearbox = request.getParameter("gearbox");
		String intake = request.getParameter("intake");
		String priceStr = request.getParameter("price");
		int priceMin = 0;
		int priceMax = 0;
		switch (priceStr) {
		case "〈10W":
			priceMin = 0;
			priceMax = 10;
			break;
		case "10W-20W":
			priceMin = 10;
			priceMax = 20;
			break;
		case "20W-30W":
			priceMin = 20;
			priceMax = 30;
			break;
		case "30W-50W":
			priceMin = 30;
			priceMax = 50;
			break;
		case "50W-100W":
			priceMin = 50;
			priceMax = 100;
			break;
		case "〉100W":
			priceMin = 100;
			priceMax = 9999;
			break;
		default:
			priceMin = -1;
			priceMax = -1;
			break;
		}
		Car carInf = new Car(level, intake, gearbox, driveMode, priceMin, priceMax);
		return carService.selectCar(carInf);
	}
	/**
	 * 根据名称查询车辆信息
	 * @return
	 */
	@RequestMapping("searchCar")
	@ResponseBody
	public Object searchCar(String carName) {
		Car car = new Car(0, 0, null, carName, null);
		return carService.searchCar(car);
	}
	/**
	 * 查询车辆详细信息
	 * @return
	 */
	@RequestMapping("selectCarById")
	public String selectCarById(String carId, HttpServletRequest request, HttpServletResponse response) {
		int carid = Integer.parseInt(carId);
		Car car = new Car(carid, 0, null, null, null);
		Car carDetail = carService.selectCarById(car);
		request.setAttribute("carDetail", carDetail);
//		return "redirect:detail.jsp";
		return "detail";
	}
	/**
	 * 查询所有车辆的品牌
	 * @return
	 */
	@RequestMapping("selectAllBrand")
	@ResponseBody
	public Object selectAllBrand(){
		return carService.selectAllBrand();
	}
	/**
	 * 根据品牌查询该品牌所有车辆名称
	 * @param brand
	 * @return
	 */
	@RequestMapping("selectCarNameByBrand")
	@ResponseBody
	public Object selectCarNameByBrand(String brand){
		Car car = new Car(0, 0, brand, null, null);
		return carService.selectCarNameByBrand(car);
	}
	/**
	 * 查询车辆详细信息
	 * @return
	 */
	@RequestMapping("addToCompare")
	@ResponseBody
	public Object addToCompare(String carid, HttpServletRequest request, HttpServletResponse response) {
		int carId = Integer.parseInt(carid);
		Car car = new Car(carId, 0, null, null, null);
		return carService.selectCarById(car);
	}
	/**
	 * 根据查询车辆id查询图片信息及部分汽车配置参数
	 * @param carid
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchCarImagesDetail")
	@ResponseBody
	public Object searchCarImagesDetail(String carid, HttpServletRequest request, HttpServletResponse response) {
		int carId = Integer.parseInt(carid);
		Car car = new Car(carId, 0, null, null, null);
		System.out.println(carService.searchCarImagesDetail(car));
		return carService.searchCarImagesDetail(car);
	}
	
}

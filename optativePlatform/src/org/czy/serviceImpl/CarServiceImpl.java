package org.czy.serviceImpl;

import java.util.List;

import org.czy.bean.Car;
import org.czy.dao.CarDao;
import org.czy.service.CarService;

public class CarServiceImpl implements CarService {
	/*属性*/
	private CarDao carDao;
	public CarDao getCarDao() {
		return carDao;
	}
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}
	/**
	 * 查询所有车辆信息
	 */
	@Override
	public List<Car> selectAllCar() {
		return carDao.selectAllCar();
	}
	/**
	 * 根据条件查询
	 */
	@Override
	public List<Car> selectCar(Car car) {
		return carDao.selectCar(car);
	}
	/**
	 * 根据名称查询车辆信息
	 */
	@Override
	public List<Car> searchCar(Car car) {
		return carDao.searchCar(car);
	}
	/**
	 * 根据车辆id查询
	 */
	@Override
	public Car selectCarById(Car car) {
		return carDao.selectCarById(car);
	}
	/**
	 * 查询所有车辆平牌
	 */
	@Override
	public List<Car> selectAllBrand() {
		return carDao.selectAllBrand();
	}
	@Override
	public List<Car> selectCarNameByBrand(Car car) {
		return carDao.selectCarNameByBrand(car);
	}
	/**
	 * 根据查询车辆id查询图片信息及部分汽车配置参数
	 */
	@Override
	public List<Car> searchCarImagesDetail(Car car) {
		return carDao.searchCarImagesDetail(car);
	}
	
}

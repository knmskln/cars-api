import { Injectable } from '@nestjs/common';
import { CreateCarDto } from './dto/create-car.dto';
import { UpdateCarDto } from './dto/update-car.dto';
import {Repository} from "typeorm";
import {CarMarkEntity} from "./entities/car-mark.entity";
import {InjectRepository} from "@nestjs/typeorm";

@Injectable()
export class CarsService {
  constructor(
      @InjectRepository(CarMarkEntity)
      private readonly carMarksRepository: Repository<CarMarkEntity>
  ) {
  }

  create(createCarDto: CreateCarDto) {
    return 'This action adds a new car';
  }

  async findAll() {
    return this.carMarksRepository.find();
  }

  findOne(id: number) {
    return `This action returns a #${id} car`;
  }

  update(id: number, updateCarDto: UpdateCarDto) {
    return `This action updates a #${id} car`;
  }

  remove(id: number) {
    return `This action removes a #${id} car`;
  }
}

import { Module } from '@nestjs/common';
import { CarsService } from './cars.service';
import { CarsController } from './cars.controller';
import {TypeOrmModule} from "@nestjs/typeorm";
import {CarMarkEntity} from "./entities/car-mark.entity";

@Module({
  imports: [TypeOrmModule.forFeature([CarMarkEntity])],
  controllers: [CarsController],
  providers: [CarsService]
})
export class CarsModule {}

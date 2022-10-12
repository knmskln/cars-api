import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { CarsModule } from './cars/cars.module';
import {TypeOrmModule} from "@nestjs/typeorm";
import ormconfig from "./ormconfig";

@Module({
  imports: [CarsModule, TypeOrmModule.forRoot(ormconfig)],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}

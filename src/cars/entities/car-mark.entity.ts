import {Column, Entity, OneToMany, PrimaryGeneratedColumn} from "typeorm";
import {CarModelEntity} from "./car-model.entity";

@Entity({name: 'marks'})
export class CarMarkEntity {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    systemId: string;

    @Column()
    name: string;

    @OneToMany(() => CarModelEntity, carModel => carModel.carMark)
    carModels: CarModelEntity[];
}

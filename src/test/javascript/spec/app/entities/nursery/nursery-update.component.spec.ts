/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';

import { ProjectGhTestModule } from '../../../test.module';
import { NurseryUpdateComponent } from 'app/entities/nursery/nursery-update.component';
import { NurseryService } from 'app/entities/nursery/nursery.service';
import { Nursery } from 'app/shared/model/nursery.model';

describe('Component Tests', () => {
    describe('Nursery Management Update Component', () => {
        let comp: NurseryUpdateComponent;
        let fixture: ComponentFixture<NurseryUpdateComponent>;
        let service: NurseryService;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [ProjectGhTestModule],
                declarations: [NurseryUpdateComponent]
            })
                .overrideTemplate(NurseryUpdateComponent, '')
                .compileComponents();

            fixture = TestBed.createComponent(NurseryUpdateComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(NurseryService);
        });

        describe('save', () => {
            it(
                'Should call update service on save for existing entity',
                fakeAsync(() => {
                    // GIVEN
                    const entity = new Nursery(123);
                    spyOn(service, 'update').and.returnValue(of(new HttpResponse({ body: entity })));
                    comp.nursery = entity;
                    // WHEN
                    comp.save();
                    tick(); // simulate async

                    // THEN
                    expect(service.update).toHaveBeenCalledWith(entity);
                    expect(comp.isSaving).toEqual(false);
                })
            );

            it(
                'Should call create service on save for new entity',
                fakeAsync(() => {
                    // GIVEN
                    const entity = new Nursery();
                    spyOn(service, 'create').and.returnValue(of(new HttpResponse({ body: entity })));
                    comp.nursery = entity;
                    // WHEN
                    comp.save();
                    tick(); // simulate async

                    // THEN
                    expect(service.create).toHaveBeenCalledWith(entity);
                    expect(comp.isSaving).toEqual(false);
                })
            );
        });
    });
});

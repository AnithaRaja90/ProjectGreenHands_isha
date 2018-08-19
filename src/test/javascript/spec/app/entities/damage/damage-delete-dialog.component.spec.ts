/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Observable, of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { ProjectGhTestModule } from '../../../test.module';
import { DamageDeleteDialogComponent } from 'app/entities/damage/damage-delete-dialog.component';
import { DamageService } from 'app/entities/damage/damage.service';

describe('Component Tests', () => {
    describe('Damage Management Delete Component', () => {
        let comp: DamageDeleteDialogComponent;
        let fixture: ComponentFixture<DamageDeleteDialogComponent>;
        let service: DamageService;
        let mockEventManager: any;
        let mockActiveModal: any;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [ProjectGhTestModule],
                declarations: [DamageDeleteDialogComponent]
            })
                .overrideTemplate(DamageDeleteDialogComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(DamageDeleteDialogComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(DamageService);
            mockEventManager = fixture.debugElement.injector.get(JhiEventManager);
            mockActiveModal = fixture.debugElement.injector.get(NgbActiveModal);
        });

        describe('confirmDelete', () => {
            it('Should call delete service on confirmDelete', inject(
                [],
                fakeAsync(() => {
                    // GIVEN
                    spyOn(service, 'delete').and.returnValue(of({}));

                    // WHEN
                    comp.confirmDelete(123);
                    tick();

                    // THEN
                    expect(service.delete).toHaveBeenCalledWith(123);
                    expect(mockActiveModal.dismissSpy).toHaveBeenCalled();
                    expect(mockEventManager.broadcastSpy).toHaveBeenCalled();
                })
            ));
        });
    });
});
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HorarioAlimentacionComponent } from './horario-alimentacion.component';

describe('HorarioAlimentacionComponent', () => {
  let component: HorarioAlimentacionComponent;
  let fixture: ComponentFixture<HorarioAlimentacionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HorarioAlimentacionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HorarioAlimentacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

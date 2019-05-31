import { TestBed } from '@angular/core/testing';

import { HorarioAlimentacionService } from './horario-alimentacion.service';

describe('HorarioAlimentacionService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HorarioAlimentacionService = TestBed.get(HorarioAlimentacionService);
    expect(service).toBeTruthy();
  });
});

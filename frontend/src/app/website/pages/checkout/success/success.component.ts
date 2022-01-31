import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params} from '@angular/router';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html'
})
export class SuccessComponent implements OnInit {

  paymentId: number = 0;
  status: string = '';
  externalReference: string = '';
  preferenceId: string = '';

  constructor(private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.queryParams.subscribe(params => {
      this.paymentId = params['payment_id'];
      this.status = params['status'];
      this.externalReference = params['external_reference'];
      this.preferenceId = params['preference_id'];
    });
  }

}

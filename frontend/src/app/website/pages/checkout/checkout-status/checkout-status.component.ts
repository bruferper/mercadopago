import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-checkout-status',
  templateUrl: './checkout-status.component.html'
})
export class CheckoutStatusComponent implements OnInit {

  paymentId: number = 0;
  status: string = '';
  externalReference: string = '';
  preferenceId: string = '';

  constructor(private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.getParams();
  }

  getParams(): void {
    this.activatedRoute.queryParams.subscribe(params => {
      this.paymentId = params['payment_id'];
      this.status = params['status'];
      this.externalReference = params['external_reference'];
      this.preferenceId = params['preference_id'];
    });
  }

}

import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { catchError } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';
import { IProduct } from '../models/product.model';
import { IUser } from '../models/user.model';
import { IPaymentMethods } from '../models/payment-methods.model';
import { IBackUrls } from '../models/back-urls.model';
import { IPreferenceRequest } from '../models/preference-request.model';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  backendUrl: string = '';
  errorMessage: string = 'Error al conectarse al backend.';

  constructor(private httpClient: HttpClient) {
    this.backendUrl = environment.backendURL;
  }

  generatePreference(item: IProduct): Observable<any>{
    /* Hardcoded data here :) */
    let payer: IUser = {
      firstName: 'Lalo',
      lastName: 'Landa',
      email: 'test_user_63274575@testuser.com',
      areaCode: '11',
      phoneNumber: '22223333',
      streetName: 'Falsa',
      streetNumber: '123',
      zipCode: 1111
    }
    let paymentMethods: IPaymentMethods = {
      excludedPaymentMethods: ['amex'],
      excludedPaymentTypes: ['atm'],
      installments: 6
    }
    let backUrls: IBackUrls = {
      success: environment.backUrls[0],
      pending: environment.backUrls[1],
      failure: environment.backUrls[2]
    }
    let preference: IPreferenceRequest = {
      item: item,
      payer: payer,
      paymentMethods: paymentMethods,
      backUrls: backUrls,
      externalReference: 'bruferper@gmail.com'
    }

    return this.httpClient.post(`${this.backendUrl}/preferences`, preference)
      .pipe(
        catchError((error : HttpErrorResponse) => {
          if(error.status == 0) {
            return throwError({message: this.errorMessage})
          } else {
            return throwError(error.error)
          }
        })
      );
  }

}

import { IBackUrls } from "./back-urls.model";
import { IPaymentMethods } from "./payment-methods.model";
import { IProduct } from "./product.model";
import { IUser } from "./user.model";

export interface IPreferenceRequest {
  item: IProduct;
  payer: IUser;
  paymentMethods: IPaymentMethods;
  backUrls: IBackUrls;
  externalReference: string;
}

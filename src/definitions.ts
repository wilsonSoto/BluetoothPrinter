export interface PrintVPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  blPrint(options: { value: string }): boolean;
  testingMessage(): boolean;
}

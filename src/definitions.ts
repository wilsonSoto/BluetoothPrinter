export interface PrintVPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}

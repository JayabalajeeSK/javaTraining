package com.jb.T15ThreadsAndConcurrency;

class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 Started ");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 Started ");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 Done");
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("T1 KO");
        // Task1
        Task1 task1 = new Task1();
        // task1.run(); //typical method execution
        task1.setPriority(1);
        task1.start(); // to run as thread
        System.out.println("\n Task1 Done");

        System.out.println("T2 KO");
        // Task2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        task1.join();
        task2Thread.join();

        System.out.println("T3 KO");
        // Task3
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task3 Done");
        System.out.println("Main Done");
    }
}
// T1 KO
// Task1 Done
// T2 KO
// Task1 Started
// Task2 Started
// 201 202 203 204 205 206 101 207 208 209 102 103 104 105 106 210 211 212 213 214 107 215 108 109 110 111 112 113 114 115 216 217 218 219 116 117 220 221 222 223 224 225 226 227 118 119 228 120 229 230 231 232 233 121 122 123 124 125 234 126 127 128 235 236 237 129 130 131 132 238 133 134 239 135 136 137 138 240 241 242 243 244 245 246 247 248 249 139 140 141 250 142 143 251 144 145 146 147 148 149 150 151 152 153 154 155 252 253 254 156 157 158 255 256 159 257 258 160 161 162 163 259 164 260 261 262 165 166 167 168 169 170 263 264 265 266 171 172 173 174 175 176 177 178 179 180 181 182 267 268 269 270 271 272 273 274 275 276 277 183 278 279 280 281 282 283 284 285 286 184 185 287 288 289 186 187 188 189 190 290 291 191 292 293 294 295 192 193 194 195 296 297 298 196 299
// Task2 Done
// 197 198 199
// Task1 Done
// T3 KO
// 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399
// Task3 Done
// Main Done
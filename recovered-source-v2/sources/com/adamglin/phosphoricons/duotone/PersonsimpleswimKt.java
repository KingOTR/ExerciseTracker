package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimpleswim.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSwim", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPersonSimpleSwim", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSwim", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleswimKt {
    private static ImageVector _personSimpleSwim;

    public static final ImageVector getPersonSimpleSwim(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _personSimpleSwim;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleSwim", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(132.14f, 108.12f);
        pathBuilder.lineToRelative(57.45f, 57.46f);
        pathBuilder.curveTo(147.85f, 178.63f, 119.12f, 134.49f, 80.0f, 136.0f);
        pathBuilder.lineToRelative(38.94f, -38.95f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 132.14f, 108.12f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 48.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(176.0f, 104.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, false, 176.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 56.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 56.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(222.16f, 185.24f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, 11.26f);
        pathBuilder2.curveToRelative(-17.36f, 14.39f, -32.86f, 19.5f, -47.0f, 19.5f);
        pathBuilder2.curveToRelative(-18.58f, 0.0f, -34.82f, -8.82f, -49.93f, -17.0f);
        pathBuilder2.curveToRelative(-25.35f, -13.76f, -47.24f, -25.65f, -79.07f, 0.74f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.22f, -12.31f);
        pathBuilder2.curveToRelative(40.17f, -33.29f, 70.32f, -16.93f, 96.93f, -2.49f);
        pathBuilder2.curveToRelative(25.35f, 13.77f, 47.24f, 25.65f, 79.07f, -0.74f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 222.16f, 185.24f);
        pathBuilder2.close();
        pathBuilder2.moveTo(34.89f, 147.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.22f, 12.31f);
        pathBuilder2.curveToRelative(31.83f, -26.38f, 53.72f, -14.5f, 79.07f, -0.74f);
        pathBuilder2.curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f);
        pathBuilder2.curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.5f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.31f);
        pathBuilder2.arcToRelative(75.79f, 75.79f, 0.0f, false, true, -19.28f, 12.06f);
        pathBuilder2.lineToRelative(-53.84f, -53.82f);
        pathBuilder2.arcTo(103.34f, 103.34f, 0.0f, false, false, 64.24f, 72.0f);
        pathBuilder2.lineTo(40.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(64.24f, 88.0f);
        pathBuilder2.arcToRelative(87.66f, 87.66f, 0.0f, false, true, 41.88f, 10.56f);
        pathBuilder2.lineTo(76.49f, 128.17f);
        pathBuilder2.curveTo(63.82f, 129.35f, 50.07f, 134.84f, 34.89f, 147.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(126.46f, 113.75f);
        pathBuilder2.lineTo(172.59f, 159.87f);
        pathBuilder2.curveToRelative(-14.0f, -0.43f, -26.88f, -7.39f, -40.77f, -14.93f);
        pathBuilder2.curveToRelative(-10.75f, -5.84f, -22.09f, -12.0f, -34.42f, -15.05f);
        pathBuilder2.lineToRelative(22.26f, -22.26f);
        pathBuilder2.arcTo(87.14f, 87.14f, 0.0f, false, true, 126.46f, 113.75f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSwim = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}

package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimpleswim.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSwim", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPersonSimpleSwim", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSwim", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleswimKt {
    private static ImageVector _personSimpleSwim;

    public static final ImageVector getPersonSimpleSwim(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(144.0f, 72.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 144.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.89f, 184.19f);
        pathBuilder.curveToRelative(-31.83f, 26.39f, -53.72f, 14.51f, -79.07f, 0.74f);
        pathBuilder.curveToRelative(-26.61f, -14.44f, -56.76f, -30.81f, -96.93f, 2.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.22f, 12.31f);
        pathBuilder.curveToRelative(31.83f, -26.39f, 53.72f, -14.5f, 79.07f, -0.74f);
        pathBuilder.curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f);
        pathBuilder.curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.22f, -12.32f);
        pathBuilder.close();
        pathBuilder.moveTo(34.89f, 147.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.22f, 12.31f);
        pathBuilder.curveToRelative(31.83f, -26.38f, 53.72f, -14.5f, 79.07f, -0.74f);
        pathBuilder.curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f);
        pathBuilder.curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.31f);
        pathBuilder.arcToRelative(75.79f, 75.79f, 0.0f, false, true, -19.28f, 12.06f);
        pathBuilder.lineToRelative(-53.84f, -53.82f);
        pathBuilder.arcTo(103.34f, 103.34f, 0.0f, false, false, 64.24f, 72.0f);
        pathBuilder.lineTo(40.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(64.24f, 88.0f);
        pathBuilder.arcToRelative(87.66f, 87.66f, 0.0f, false, true, 41.88f, 10.56f);
        pathBuilder.lineTo(76.49f, 128.17f);
        pathBuilder.curveTo(63.82f, 129.36f, 50.07f, 134.84f, 34.89f, 147.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSwim = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
